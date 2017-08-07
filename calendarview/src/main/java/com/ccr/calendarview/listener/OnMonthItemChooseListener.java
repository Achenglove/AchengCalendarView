package com.ccr.calendarview.listener;

import android.view.View;

import com.ccr.calendarview.bean.DateBean;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-08-07 10:44
 * @Version: V1.0 <描述当前版本功能>
 */

public interface OnMonthItemChooseListener {
    /**
     * @param view
     * @param date
     * @param flag 多选时flag=true代表选中数据，flag=false代表取消选中
     */
    void onMonthItemChoose(View view, DateBean date, boolean flag);
}
