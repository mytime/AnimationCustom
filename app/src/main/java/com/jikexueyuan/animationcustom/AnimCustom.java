package com.jikexueyuan.animationcustom;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * 自定义动画
 */
public class AnimCustom extends Animation {

    //获取组件宽高和父级容器的宽高
    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        System.out.println("init");
        super.initialize(width, height, parentWidth, parentHeight);
    }

    //interpolatedTime 补间时间 0-1之间
    //Transformation 动画效果
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        //0-1
//        System.out.println(interpolatedTime);
        //透明效果0-1
//        t.setAlpha(interpolatedTime);
        //移位动画
//        t.getMatrix().setTranslate(200*interpolatedTime,200*interpolatedTime);
        //摇头
        t.getMatrix().setTranslate((float) (Math.sin(interpolatedTime*20)*50),0);

        super.applyTransformation(interpolatedTime, t);
    }
}
