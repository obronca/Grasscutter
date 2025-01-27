package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.GenshinPlayer;
import emu.grasscutter.game.World;
import emu.grasscutter.net.packet.GenshinPacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.PlayerGameTimeNotifyOuterClass.PlayerGameTimeNotify;

public class PacketPlayerGameTimeNotify extends GenshinPacket {
	
	public PacketPlayerGameTimeNotify(World world, GenshinPlayer player) {
		super(PacketOpcodes.PlayerGameTimeNotify);
		
		PlayerGameTimeNotify proto = PlayerGameTimeNotify.newBuilder()
				.setGameTime(world.getTime())
				.setUid(player.getId())
				.build();
		
		this.setData(proto);
	}
}
