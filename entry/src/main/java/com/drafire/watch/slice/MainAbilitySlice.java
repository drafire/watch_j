package com.drafire.watch.slice;

import com.drafire.watch.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class MainAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_main_layout);
        Component buttonComponet = findComponentById(ResourceTable.Id_button);
        if (null != buttonComponet) {
            Button button = (Button) buttonComponet;
            button.setClickedListener(component -> {
                Intent indexIntent = new Intent();
                indexIntent.setParam("name", "鸿蒙新ability");
                //下面这种形式，则是传递任意类型的参数。
                //需要注意的是，如果使用了下面这种形式，则上面的setParam的name参数不会再被传递，也就是说，只能传递一个参数
//                IntentParams params=new IntentParams();
//                params.setParam("pratice",new Pratice("舒服",1,1));
//                indexIntent.setParams(params);
//                present(new IndexSlice(),indexIntent);
                indexIntent.setAction("action.system.countDown");
                startAbility(indexIntent);
            });
        }
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
