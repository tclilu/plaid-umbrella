package io.github.llnancy.mojian.base.entity.request;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * base page request
 *
 * @author sunchaser admin@lilu.org.cn
 * @since JDK8 2021/10/24
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BasePageRequest extends BaseRequest {

    private static final long serialVersionUID = -7698513373426563684L;

    /**
     * 当前页码
     */
    private Integer pageNo = 1;

    /**
     * 每页大小
     */
    private Integer pageSize = 20;

    /**
     * 获取 MyBatis-Plus 的 {@link Page} 对象
     *
     * @param <T> record type
     * @return {@link Page}
     */
    public <T> Page<T> getMpPage() {
        return Page.of(this.pageNo, this.pageSize);
    }
}
