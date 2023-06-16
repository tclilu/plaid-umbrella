package io.github.llnancy.mojian.log.annotation;

import io.github.llnancy.mojian.log.config.AccessLogAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Enable @AccessLog
 *
 * @author llnancy admin@lilu.org.cn
 * @since JDK8 2023/6/15
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AccessLogAutoConfiguration.class)
public @interface EnableMjLog {
}
