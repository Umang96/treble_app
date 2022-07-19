package me.phh.treble.app

import android.os.SystemProperties
import android.util.Log

object PocoF4Defaults {
    fun loadDefaultsForF4IfNeeded() {
                Log.d("PHH", "Setting POCO F4 defaults now")
                Misc.forceFps(1)
                Misc.safeSetprop("persist.sys.phh.disable_soundvolume_effect", "1")
                SystemProperties.set("persist.sys.phh.backlight.scale", "1")
                Misc.safeSetprop("persist.sys.phh.include_all_cameras", "true")
                Misc.safeSetprop("persist.sys.phh.caf.media_profile", "true")
                Misc.safeSetprop("persist.vendor.vilte_support", "0")
                Misc.safeSetprop("persist.dbg.vt_avail_ovr", "1")
                Misc.safeSetprop("persist.dbg.volte_avail_ovr", "1")
                Misc.safeSetprop("persist.dbg.wfc_avail_ovr", "1")
                Misc.safeSetprop("persist.dbg.allow_ims_off", "1")
                Misc.safeSetprop("persist.sys.phh.caf.audio_policy", "1")
    }
}