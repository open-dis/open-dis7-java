package edu.nps.moves.dis7.entities.nzl.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$CategoryElem@52d10fb8
 * Country: New Zealand (NZL)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31933
 */
public class ArmoredFightingVehicle extends EntityType
{
    public ArmoredFightingVehicle()
    {
        setCountry(Country.NEW_ZEALAND_NZL);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 31933, Armored Fighting Vehicle
    }
}