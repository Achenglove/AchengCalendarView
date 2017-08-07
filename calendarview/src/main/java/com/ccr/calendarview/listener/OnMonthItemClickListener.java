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

public interface OnMonthItemClickListener {
    /**
     * @param view
     * @param date
     */
    void onMonthItemClick(View view, DateBean date);
}
