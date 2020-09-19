package com.drafire.tv_j.slice;

import com.drafire.tv_j.ResourceTable;
import com.drafire.tv_j.model.Pratice;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class IndexSlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        //ResourceTable需要运行一下，才能枚举出新建的layout
        super.setUIContent(ResourceTable.Layout_index_layout);
        Component textComponent = findComponentById(ResourceTable.Id_text);
        Text text=(Text)textComponent;
        if(null!=text){
            //以下这两种方法，都可以拿到name的值。但是getStringParam只能拿到String的值
            System.out.println(intent.getStringParam("name"));
            Object pratice = intent.getParams().getParam("pratice");
            text.setText(intent.getStringParam("name"));
        }


        Component buttonComponent = findComponentById(ResourceTable.Id_buttonNext);
        if(null!=buttonComponent){
            Button button = (Button) buttonComponent;
            button.setClickedListener(listener->{
                Intent indexIntent=new Intent();
                present(new MainAbilitySlice(),indexIntent);
            });
        }
    }
}
