package me.phh.treble.app

import android.content.Context
import android.os.SystemProperties
import android.util.Log

object PocoF4Defaults {
    fun loadDefaultsForF4IfNeeded(context: Context?) {
        context?.also { ctx ->
            if(!ctx.getSharedPreferences("prefs_device_defaults", Context.MODE_PRIVATE).getBoolean("defaults_applied_once", false)) {
                Log.d("PHH", "Setting POCO F4 defaults now")
                Misc.forceFps(1)
                Misc.safeSetprop("persist.sys.phh.disable_soundvolume_effect", "1")
                SystemProperties.set("persist.sys.phh.backlight.scale", "1")
                Misc.safeSetprop("persist.sys.phh.include_all_cameras", "true")
                Misc.safeSetprop("persist.sys.phh.caf.media_profile", "true")
                ctx.getSharedPreferences("prefs_device_defaults", Context.MODE_PRIVATE)
                    .edit().putBoolean("defaults_applied_once", true).apply()
            }
        }
    }
}