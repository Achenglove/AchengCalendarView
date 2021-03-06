package com.ccr.achengcalendarview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ccr.calendarview.bean.DateBean;
import com.ccr.calendarview.listener.OnMonthItemChooseListener;
import com.ccr.calendarview.listener.OnPagerChangeListener;
import com.ccr.calendarview.view.CalendarView;
import com.ccr.calendarview.view.WeekView;


public class MultiChooseActivity extends AppCompatActivity {

    private CalendarView calendarView;
    private TextView chooseDate;
    private WeekView weekView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_choose);

        final TextView title = (TextView) findViewById(R.id.title);

        final StringBuilder sb = new StringBuilder();

        chooseDate = (TextView) findViewById(R.id.choose_date);

        calendarView = (CalendarView) findViewById(R.id.calendar);
        weekView = (WeekView) findViewById(R.id.weekView);
        String[] weekArray = {"周日", "周一", "周二", "周三", "周四", "周五", "周六"};
        weekView.setDate(weekArray);
        calendarView.init();

        DateBean date = calendarView.getDateInit();
        title.setText(date.getSolar()[0] + "年" + date.getSolar()[1] + "月" + date.getSolar()[2] + "日");

        String d = date.getSolar()[0] + "." + date.getSolar()[1] + "." + date.getSolar()[2] + ".";
        sb.append("选中：" + d + "\n");
        chooseDate.setText(sb.toString());

        calendarView.setOnMonthItemChooseListener(new OnMonthItemChooseListener() {
            @Override
            public void onMonthItemChoose(View view, DateBean date, boolean flag) {

                String d = date.getSolar()[0] + "." + date.getSolar()[1] + "." + date.getSolar()[2];
                if (flag) {//选中
                    sb.append("选中：" + d + "\n");
                } else {//取消选中
                    sb.append("取消：" + d + "\n");
                }
                chooseDate.setText(sb.toString());
            }
        });

        calendarView.setOnPagerChangeListener(new OnPagerChangeListener() {
            @Override
            public void onPagerChanged(int[] date) {
                title.setText(date[0] + "年" + date[1] + "月" + date[2] + "日");
            }
        });
    }

    public void lastMonth(View view) {
        calendarView.lastMonth();
    }

    public void nextMonth(View view) {
        calendarView.nextMonth();
    }
}
