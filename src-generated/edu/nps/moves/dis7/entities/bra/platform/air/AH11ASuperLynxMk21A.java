package edu.nps.moves.dis7.entities.bra.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@146ba0ac
 * Country: Brazil (BRA)
 * Entity kind: Platform
 * Domain: AIR
 *
 * Entity type uid: 32177
 */
public class AH11ASuperLynxMk21A extends EntityType
{
    public AH11ASuperLynxMk21A()
    {
        setCountry(Country.BRAZIL_BRA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)22); // uid 31996, Anti-Submarine Warfare/Patrol Helicopter
        setSubCategory((byte)2); // uid 32176, Westland Lynx (Naval)
        setSpecific((byte)1); // uid 32177, AH-11A Super Lynx Mk21A
    }
}
