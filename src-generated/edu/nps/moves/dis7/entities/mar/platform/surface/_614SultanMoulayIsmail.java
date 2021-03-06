package edu.nps.moves.dis7.entities.mar.platform.surface;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@3546d80f;
 * Country: Morocco (MAR);
 * Entity kind: Platform;
 * Domain: SURFACE;
 *
 * Entity type uid: 28867
 */
public class _614SultanMoulayIsmail extends EntityType
{
    /** Default constructor */
    public _614SultanMoulayIsmail()
    {
        setCountry(Country.MOROCCO_MAR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SURFACE));

        setCategory((byte)50); // uid 28865, Frigate (including Corvette)
        setSubCategory((byte)1); // uid 28866, Sigma 9813 Class
        setSpecific((byte)1); // uid 28867, 614 Sultan Moulay Ismail
    }
}
