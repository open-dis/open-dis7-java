package edu.nps.moves.dis7.entities.irq.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@3b0c9195;
 * Country: Iraq (IRQ);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 17992
 */
public class _262mmABABEEL extends EntityType
{
    /** Default constructor */
    public _262mmABABEEL()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)4); // uid 17990, Self-Propelled Artillery
        setSubCategory((byte)2); // uid 17992, 262 mm ABABEEL
    }
}
