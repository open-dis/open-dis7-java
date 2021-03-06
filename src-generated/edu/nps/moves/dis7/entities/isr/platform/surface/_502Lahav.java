package edu.nps.moves.dis7.entities.isr.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2f05be7f;
 * Country: Israel (ISR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 18213
 */
public class _502Lahav extends EntityType
{
    /** Default constructor */
    public _502Lahav()
    {
        setCountry(Country.ISRAEL_ISR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 18209, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 18210, Eilat (Saar 5) Class (Corvette)
        setSpecific((byte)3); // uid 18213, 502 Lahav
    }
}
