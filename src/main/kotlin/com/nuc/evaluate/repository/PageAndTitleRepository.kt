package com.nuc.evaluate.repository

import com.nuc.evaluate.po.PagesAndTitle
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

/**
 * @author 杨晓辉 2018/2/4 10:03
 */
@Repository
interface PageAndTitleRepository : JpaRepository<PagesAndTitle, Long> {
    /**
     * 通过 pageId 查找
     * @param pageId 考卷id
     * @return 查询的list集合
     */
    fun findByPagesId(pageId: Long): List<PagesAndTitle>
}