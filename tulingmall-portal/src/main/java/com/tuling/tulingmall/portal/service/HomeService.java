package com.tuling.tulingmall.portal.service;

import com.tuling.tulingmall.model.CmsSubject;
import com.tuling.tulingmall.model.PmsProduct;
import com.tuling.tulingmall.model.PmsProductCategory;
import com.tuling.tulingmall.portal.domain.HomeContentResult;
import com.tuling.tulingmall.promotion.domain.FlashPromotionProduct;

import java.util.List;

/**
 * 首页内容管理Service
 */
public interface HomeService {

    /**
     * 获取首页管理系统CMS推荐数据
     */
    HomeContentResult cmsContent(HomeContentResult content);

    /*获取营销系统推荐数据*/
    HomeContentResult recommendContent();

    HomeContentResult getFromRemote();

    List<FlashPromotionProduct> getSecKillFromRemote();

    void preheatCache();

    /**
     * 首页商品推荐
     */
    List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum);

    /**
     * 获取商品分类
     * @param parentId 0:获取一级分类；其他：获取指定二级分类
     */
    List<PmsProductCategory> getProductCateList(Long parentId);

    /**
     * 根据专题分类分页获取专题
     * @param cateId 专题分类id
     */
    List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum);
}
