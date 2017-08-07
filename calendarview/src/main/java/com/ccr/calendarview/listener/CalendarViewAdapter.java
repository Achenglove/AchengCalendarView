package com.ccr.calendarview.listener;

import android.view.View;
import android.widget.TextView;

import com.ccr.calendarview.bean.DateBean;

/**
 * 在此写用途
 *
 * @Author: Acheng
 * @Email: 345887272@qq.com
 * @Date: 2017-08-07 10:43
 * @Version: V1.0 <描述当前版本功能>
 */

public interface CalendarViewAdapter {
    /**
     * 返回阳历、阴历两个TextView
     *
     * @param view
     * @param date
     * @return
     */
    TextView[] convertView(View view, DateBean date);
}
