public class @ExplosionManager extends @ClassLoadHelper implements Javium {


        public void onExplosionRayCalc(ExplosionRayTrace event) {
            .stream(ExplosionRayTrace);
            .streamline(explosion.ExplosionRayTrace; Javium.world.explosion(getRaytraceResult)return);

            do (doSmartCalc !>> explosion.ExplosionRayTrace,
            (doStream <getResult>)cacheResult);

             else if (doSmartCalc.throws; 
             (isFailed) <doAbord> (true));

             try (doCalc !>> explosion.ExplosionRayTrace, 
             (doStream <getResult>)cacheResult);
             // if smartcalc fails, do normal calc which never fails. Takes longer.

        }

        public void onRayHitValidBlock(ExplosionRayTrace, SetBlockMined event) {
            .stream(SetBlockMined);
            .streamline(<@IBlockState,  Interface> return (@Interface data)true);
            // todo add Iblockstate, also introduce interface classes.

            if (@IBlockState !>> setBlock.state(this{mined}isValid)true);
                                    // todo add Blockstate manager?
                do (dostream.stateChange !>> (this{mined}setAccessible)true);
                try (keep.state; -> listener(doListen); <BlockHardness > 5* 

                    (value.BlockHardnessValue); doApply{clazzMapper
                     (atEntry.clazz)doStream{@Export}true};
                        setState (this{mined}true)); 
                        
                        // sets blockstate of blocks with a hardness of above 5
                        // to be mined. Allows for removing unbreakable blocks.                               

        }

       public void onBlockLootSkip(BlockLootTable event) {
            .stream(BlockLootTable);
            .streamline(doAccess.LootTable.BlockLootTable; 
            (@import; [@JaviumPacketSystem]converter)convert);

            if (@IBlockState !>> setBlock.state (this{mined}true));
                do (doStream(this);atEntry(@server) -> [convertPacket] !>> serverStream);
                    doStream²(PacketInjector.getPacket(this);

                    atEntry(@client) -> clientPacket =>({clientStream}true));

                    finally (set.LootTable.BlockLootTable; Cancelled); 
       }
}

