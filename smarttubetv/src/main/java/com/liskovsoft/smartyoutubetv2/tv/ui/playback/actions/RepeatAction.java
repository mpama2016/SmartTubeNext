package com.liskovsoft.smartyoutubetv2.tv.ui.playback.actions;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.PlaybackControlsRow.MultiAction;

import com.liskovsoft.smartyoutubetv2.common.app.models.playback.manager.PlayerEngineConstants;
import com.liskovsoft.smartyoutubetv2.tv.R;

/**
 * An action for displaying two repeat states: none and all.
 */
public class RepeatAction extends MultiAction {
    private static final int INDEX_NONE = PlayerEngineConstants.REPEAT_MODE_CLOSE;
    private static final int INDEX_ONE = PlayerEngineConstants.REPEAT_MODE_ONE;
    private static final int INDEX_ALL = PlayerEngineConstants.REPEAT_MODE_ALL;
    private static final int INDEX_PAUSE = PlayerEngineConstants.REPEAT_MODE_PAUSE;
    private static final int INDEX_LIST = PlayerEngineConstants.REPEAT_MODE_LIST;
    private static final int INDEX_SHUFFLE = PlayerEngineConstants.REPEAT_MODE_SHUFFLE;
    private static final int INDEX_REVERSE_LIST = PlayerEngineConstants.REPEAT_MODE_REVERSE_LIST;

    /**
     * Constructor
     * @param context Context used for loading resources.
     */
    public RepeatAction(Context context) {
        this(context, ActionHelpers.getIconHighlightColor(context));
    }

    /**
     * Constructor
     * @param context Context used for loading resources
     * @param selectionColor Color to display the repeat-all icon.
     */
    public RepeatAction(Context context, int selectionColor) {
        super(R.id.action_repeat);
        Drawable[] drawables = new Drawable[7];
        BitmapDrawable repeatNoneDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_none);
        BitmapDrawable repeatOneDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_one);
        BitmapDrawable repeatAllDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_all);
        BitmapDrawable repeatPauseDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_pause);
        BitmapDrawable repeatListDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_list);
        BitmapDrawable repeatShuffleDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_shuffle);
        BitmapDrawable reverseListDrawable = (BitmapDrawable) ContextCompat.getDrawable(context, R.drawable.action_repeat_reverse_list);
        drawables[INDEX_NONE] = ActionHelpers.createDrawable(context, repeatNoneDrawable, selectionColor);
        drawables[INDEX_ONE] = ActionHelpers.createDrawable(context, repeatOneDrawable, selectionColor);
        drawables[INDEX_ALL] = ActionHelpers.createDrawable(context, repeatAllDrawable, selectionColor);
        drawables[INDEX_PAUSE] = ActionHelpers.createDrawable(context, repeatPauseDrawable, selectionColor);
        drawables[INDEX_LIST] = ActionHelpers.createDrawable(context, repeatListDrawable, selectionColor);
        drawables[INDEX_SHUFFLE] = ActionHelpers.createDrawable(context, repeatShuffleDrawable, selectionColor);
        drawables[INDEX_REVERSE_LIST] = ActionHelpers.createDrawable(context, reverseListDrawable, selectionColor);
        setDrawables(drawables);

        String[] labels = new String[drawables.length];
        // Note, labels denote the action taken when clicked
        labels[INDEX_NONE] = context.getString(R.string.repeat_mode_none);
        labels[INDEX_ONE] = context.getString(R.string.repeat_mode_one);
        labels[INDEX_ALL] = context.getString(R.string.repeat_mode_all);
        labels[INDEX_PAUSE] = context.getString(R.string.repeat_mode_pause);
        labels[INDEX_LIST] = context.getString(R.string.repeat_mode_pause_alt);
        labels[INDEX_SHUFFLE] = context.getString(R.string.repeat_mode_shuffle);
        labels[INDEX_REVERSE_LIST] = context.getString(R.string.repeat_mode_reverse_list);
        setLabels(labels);
    }
}
