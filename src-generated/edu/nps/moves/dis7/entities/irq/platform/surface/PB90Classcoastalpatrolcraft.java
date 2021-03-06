package edu.nps.moves.dis7.entities.irq.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@1b2c4efb;
 * Country: Iraq (IRQ);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18009
 */
public class PB90Classcoastalpatrolcraft extends EntityType
{
    /** Default constructor */
    public PB90Classcoastalpatrolcraft()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18007, Light/Patrol Craft
        setSubCategory((byte)2); // uid 18009, PB 90 Class (coastal patrol craft)
    }
}
