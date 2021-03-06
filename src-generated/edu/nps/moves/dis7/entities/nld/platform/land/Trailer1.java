package edu.nps.moves.dis7.entities.nld.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@63f34b70;
 * Country: Netherlands (NLD);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 27963
 */
public class Trailer1 extends EntityType
{
    /** Default constructor */
    public Trailer1()
    {
        setCountry(Country.NETHERLANDS_NLD);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)19); // uid 27957, Heavy Equipment Transport Trailer
        setSubCategory((byte)2); // uid 27961, DAF XF95 TROPCO 650 KN
        setSpecific((byte)2); // uid 27963, Trailer
    }
}
