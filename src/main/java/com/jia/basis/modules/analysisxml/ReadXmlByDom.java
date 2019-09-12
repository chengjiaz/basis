package com.jia.basis.modules.analysisxml;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangjiacheng
 * @description: dom解析xml
 * @date 2019/7/25 22:11
 */
@Slf4j
@RestController
@RequestMapping("dom")
public class ReadXmlByDom {
    private static DocumentBuilderFactory dbFactory = null;
    private static DocumentBuilder db = null;
    private static Document document = null;
    private static List<User> users = null;
    static{
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            db = dbFactory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }

    public static List<User> getBooks(String fileName) throws Exception{
        //将给定 URI 的内容解析为一个 XML 文档,并返回Document对象
        document = db.parse(fileName);
        //按文档顺序返回包含在文档中且具有给定标记名称的所有 Element 的 NodeList
        NodeList bookList = document.getElementsByTagName("user");
        users = new ArrayList<User>();
        //遍历books
        for(int i=0;i<bookList.getLength();i++){
            User user = new User();
            //获取第i个user结点
            org.w3c.dom.Node node = bookList.item(i);
            //获取第i个User的所有属性
            NamedNodeMap namedNodeMap = node.getAttributes();
            //获取已知名为id的属性值
            String id = namedNodeMap.getNamedItem("id").getTextContent();
            user.setId(Integer.parseInt(id));

            //获取User结点的子节点,包含了Test类型的换行
            NodeList cList = node.getChildNodes();

            //将一个user里面的属性加入数组
            ArrayList<String> contents = new ArrayList<>();
            for(int j=1;j<cList.getLength();j+=2){
                org.w3c.dom.Node cNode = cList.item(j);
                String content = cNode.getFirstChild().getTextContent();
                contents.add(content);
            }

            user.setName(contents.get(0));
            user.setAge(Integer.parseInt(contents.get(1)));
            user.setMoney(Double.parseDouble(contents.get(2)));
            users.add(user);
        }

        return users;

    }

    public static void main(String args[]){
        String fileName = "src/main/resources/xml/User.xml";
        try {
            List<User> list = ReadXmlByDom.getBooks(fileName);
            for(User user :list){
                log.info("ReadXmlByDom->main:出参【{}】", JSON.toJSON(user));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
