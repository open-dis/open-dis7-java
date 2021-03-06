package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@17cdf2d0;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18228
 */
public class _323Akko extends EntityType
{
    /** Default constructor */
    public _323Akko()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)7); // uid 18214, Light/Patrol Craft
        setSubCategory((byte)3); // uid 18222, Mivtach (Saar 2) Class (fast attack craft-missile)
        setSpecific((byte)6); // uid 18228, 323 Akko
    }
}
