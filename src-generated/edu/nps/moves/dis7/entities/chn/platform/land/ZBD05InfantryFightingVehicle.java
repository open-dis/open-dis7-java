package edu.nps.moves.dis7.entities.chn.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@5c18298f
 * Country: China, Peoples Republic of (CHN)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 31854
 */
public class ZBD05InfantryFightingVehicle extends EntityType
{
    public ZBD05InfantryFightingVehicle()
    {
        setCountry(Country.CHINA_PEOPLES_REPUBLIC_OF_CHN);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 16876, Armored Fighting Vehicle
        setSubCategory((byte)8); // uid 31853, Type 05 Amphibious Fighting Vehicle (AFV)
        setSpecific((byte)1); // uid 31854, ZBD 05 Infantry Fighting Vehicle
    }
}