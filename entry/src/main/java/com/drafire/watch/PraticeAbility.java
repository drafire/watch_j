package com.drafire.watch;

import com.drafire.watch.slice.PraticeAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class PraticeAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(PraticeAbilitySlice.class.getName());
    }
}
