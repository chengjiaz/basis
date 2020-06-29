package jia.test.snowflakeutiltest;

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
        log.info("SnowFlakeUtilTest:生成全局唯一id:【{}】", SnowFlakeUtil.getId());
        log.info("SnowFlakeUtilTest:生成全局唯一id:【{}】", SnowFlakeUtil.getId().length());
    }
}
