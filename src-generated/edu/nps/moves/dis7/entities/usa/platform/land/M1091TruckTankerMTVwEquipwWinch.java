package edu.nps.moves.dis7.entities.usa.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@1e1eeedd
 * Country: United States of America (USA)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 10501
 */
public class M1091TruckTankerMTVwEquipwWinch extends EntityType
{
    public M1091TruckTankerMTVwEquipwWinch()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)7); // uid 10418, Large Wheeled Utility Vehicle
        setSubCategory((byte)12); // uid 10481, Stewart & Stevenson Family of Medium Tactical Vehicles (FMTV)
        setSpecific((byte)20); // uid 10501, M1091 Truck, Tanker; MTV w/ Equip, w/ Winch
    }
}