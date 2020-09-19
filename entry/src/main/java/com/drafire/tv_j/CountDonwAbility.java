package com.drafire.tv_j;

import com.drafire.tv_j.slice.CountDonwAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class CountDonwAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(CountDonwAbilitySlice.class.getName());
    }
}
