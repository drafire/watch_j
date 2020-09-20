package com.drafire.watch.slice;

import com.drafire.watch.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class CountDonwAbilitySlice extends AbilitySlice {

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_count_down_layout);
        Component textComponent = findComponentById(ResourceTable.Id_text);
        if (null != textComponent) {
            Text text = (Text) textComponent;
            text.setText(intent.getStringParam("name"));
        }
        System.out.println("倒计时----------------" + intent.getStringParam("name"));
        Component btnComponent = findComponentById(ResourceTable.Id_btnReturn);
        if (null != btnComponent) {
            Button btn = (Button) btnComponent;
            btn.setClickedListener(component -> {
                Intent returnIntent=new Intent();
                returnIntent.setAction("action.system.home");

                startAbility(returnIntent);
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
