package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@23a9ba52;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 27693
 */
public class _611MohammedV extends EntityType
{
    /** Default constructor */
    public _611MohammedV()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)6); // uid 27691, Guided Missile Frigate (FFG)
        setSubCategory((byte)1); // uid 27692, Floreal Class
        setSpecific((byte)1); // uid 27693, 611 Mohammed V
    }
}
