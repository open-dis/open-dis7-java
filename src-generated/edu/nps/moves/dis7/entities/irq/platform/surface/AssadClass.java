package edu.nps.moves.dis7.entities.irq.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@5829e4f4;
 * Country: Iraq (IRQ);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18004
 */
public class AssadClass extends EntityType
{
    /** Default constructor */
    public AssadClass()
    {
        setCountry(Country.IRAQ_IRQ);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18003, Guided Missile Frigate
        setSubCategory((byte)1); // uid 18004, Assad Class
    }
}
