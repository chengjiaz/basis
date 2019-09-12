package com.jia.basis.modules.analysisxml;

import com.jia.basis.entity.SysDict;
import com.jia.basis.service.SysDictService;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.List;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/7/30 9:08
 */
@RestController
@RequestMapping("xml")
@Slf4j
public class WxmlControllerTest {
    @Autowired
    private   SysDictService sysDictService;

    @RequestMapping(value = {"/writeXml"}, method = RequestMethod.POST)
    public  String writeXml() throws  Exception{
        Element root2= DocumentHelper.createElement("sysDictStore");
        Document document2=DocumentHelper.createDocument(root2);
        //获取数据
        List<SysDict> findSysDictList = sysDictService.findSysList();

        if (findSysDictList.size() > 0 && findSysDictList != null) {
            log.info("WxmlControllerTest->writeXml:成功获取【{}】条数据", findSysDictList.size());

            for (int i = 0; i < 10; i++) {
                //反射获取class的私有属性
                Field[] fields = SysDict.class.getDeclaredFields();

                //使用私有属性填充xml的Element元素
                for (Field field : fields) {
                    field.setAccessible(true);
                    //id
                    if("id".equals(field.getName())){
                        Element idElement = root2.addElement(field.getName());
                        idElement.setText(findSysDictList.get(i).getId().toString());
                    }

                    //dictName
                    if("dictName".equals(field.getName())){
                        Element dictNameElement = root2.addElement(field.getName());
                        dictNameElement.setText(findSysDictList.get(i).getDictName());
                    }

                    //dictValue
                    if("dictValue".equals(field.getName())){
                        Element dictValueElement = root2.addElement(field.getName());
                        dictValueElement.setText(findSysDictList.get(i).getDictValue());
                    }

                    //dictOrder
                    if("dictOrder".equals(field.getName())){
                        Element dictOrderElement = root2.addElement(field.getName());
                        dictOrderElement.setText(findSysDictList.get(i).getDictOrder());
                    }
                }


            }
            OutputFormat format = new OutputFormat("", true);
            // 另一种输出方式，记得要调用flush()方法,否则输出的文件中显示空白，调用close() 方法释放资源
            XMLWriter xmlWriter = new XMLWriter(new FileWriter("d:/sysdict.xml"),
                    format);
            xmlWriter.write(document2);
            xmlWriter.flush();
            xmlWriter.close();
        }

        return null;
    }


}
