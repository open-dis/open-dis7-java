package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4351c8c3
 * Country: Israel (ISR)
 * Entity kind: Platform
 * Domain: SURFACE
 *
 * Entity type uid: 23770
 */
public class DaburClasscoastalpatrolcraft864 extends EntityType
{
    public DaburClasscoastalpatrolcraft864()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18214, Light/Patrol Craft
        setSubCategory((byte)6); // uid 18240, Dabur Class (coastal patrol craft)
        setSpecific((byte)7); // uid 23770, 864
    }
}
