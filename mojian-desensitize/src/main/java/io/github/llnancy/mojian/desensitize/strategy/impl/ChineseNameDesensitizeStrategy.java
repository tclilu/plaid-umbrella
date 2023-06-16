package io.github.llnancy.mojian.desensitize.strategy.impl;

/**
 * chinese name desensitize strategy.
 * display only the first Chinese character.
 *
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2022/12/23
 */
public class ChineseNameDesensitizeStrategy extends AbstractHeadTailDesensitizeStrategy {

    @Override
    protected int repeatLength(String source) {
        return 2;
    }

    @Override
    protected int headLength() {
        return 1;
    }
}
