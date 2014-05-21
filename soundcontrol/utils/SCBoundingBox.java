package com.toblexson.soundcontrol.utils;

import net.minecraft.util.AxisAlignedBB;

public class SCBoundingBox extends AxisAlignedBB {

	public SCBoundingBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
		super(minX, minY, minZ, maxX, maxY, maxZ);
	}
}
