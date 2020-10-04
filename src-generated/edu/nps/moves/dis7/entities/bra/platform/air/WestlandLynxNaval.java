package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@6eebc39e
 * Country: Brazil (BRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 32176
 */
public class WestlandLynxNaval extends EntityType
{
    public WestlandLynxNaval()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 31996, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)2); // uid 32176, Westland Lynx (Naval)
    }
}
