package com.example.administrator.my;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 李艳龙2017/2/9
 */
public class MainActivity extends AppCompatActivity {


    private NewsFragmentTabHost mTabHost;
    private TextView title;

    private int mImageView[] = {R.drawable.main_index_cart_normal,
                                R.drawable.main_index_home_normal,
                                R.drawable.main_index_my_normal,
                                R.drawable.main_index_tuan_normal};
    private String mTags[] = {"月光茶人","优惠","购物车","我的"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTabHost = (NewsFragmentTabHost) findViewById(R.id.activity_main);
        title = (TextView) findViewById(R.id.title);
                
    }
}
