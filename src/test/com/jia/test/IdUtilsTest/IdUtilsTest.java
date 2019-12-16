package jia.test.IdUtilsTest;

import com.jia.basis.common.utils.IdUtils;
import lombok.extern.slf4j.Slf4j;

/**
 * @author zhangjiacheng
 * @description: TODO
 * @date 2019/12/16 16:57
 */
@Slf4j
public class IdUtilsTest {
    public static void main(String[] args) {

        log.info("IdUtils生成id为:【{}】",IdUtils.getGenerateNumber());
    }
}
