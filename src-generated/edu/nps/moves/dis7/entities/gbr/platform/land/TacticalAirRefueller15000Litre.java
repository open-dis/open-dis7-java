package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@7f5b9db;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 26210
 */
public class TacticalAirRefueller15000Litre extends EntityType
{
    /** Default constructor */
    public TacticalAirRefueller15000Litre()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 14935, Large Wheeled Utility Vehicle
        setSubCategory((byte)17); // uid 26209, Oshkosh Close Support Tanker
        setSpecific((byte)1); // uid 26210, Tactical Air Refueller (15000 Litre)
    }
}
