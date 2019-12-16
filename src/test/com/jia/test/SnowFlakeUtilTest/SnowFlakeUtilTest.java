package jia.test.SnowFlakeUtilTest;

import com.jia.basis.common.utils.SnowFlakeUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/12/16 16:42
 */
@Slf4j
public class SnowFlakeUtilTest {

    public static void main(String[] args) {
       log.info("全局唯一id:【{}】", SnowFlakeUtil.getId());
    }
}
