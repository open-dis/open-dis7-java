package edu.nps.moves.dis7.entities.ind.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ed5eb72;
 * Country: India (IND);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 31656
 */
public class AkashRohiniCentralAcquisitionRadar extends EntityType
{
    /** Default constructor */
    public AkashRohiniCentralAcquisitionRadar()
    {
        setCountry(Country.INDIA_IND);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)28); // uid 31652, Air Defense / Missile Defense Unit Equipment
        setSubCategory((byte)1); // uid 31653, Akash Surface-to-Air Missile (SAM) system
        setSpecific((byte)3); // uid 31656, Akash Rohini Central Acquisition Radar
    }
}
