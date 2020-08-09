/*
 * Copyright (c) 2018 Abex
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.devtools;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.Range;

import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

@ConfigGroup("devtools")
public interface DevToolsConfig extends Config
{
	@ConfigItem(
		keyName = "inspectorAlwaysOnTop",
		name = "",
		description = "",
		hidden = true
	)
	default boolean inspectorAlwaysOnTop()
	{
		return false;
	}

	@ConfigItem(
		keyName = "inspectorAlwaysOnTop",
		name = "",
		description = ""
	)
	void inspectorAlwaysOnTop(boolean value);

	@ConfigItem(
		keyName = "hideOverlayToggle",
		name = "Hide Overlay Hotkey",
		description = "Hotkey to hide RuneLite overlays"
	)
	default Keybind hideOverlayToggle()
	{
		return new Keybind(KeyEvent.VK_H, InputEvent.CTRL_DOWN_MASK);
	}

	@ConfigItem(
		keyName = "soundEffectsLines",
		name = "Sound Effects Lines",
		description = "Number of lines displayed in the sound effect overlay"
	)
	default int soundEffectsLines()
	{
		return 16;
	}
}
