package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@79c5460e
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR)
 * Entity kind: Platform
 * Domain: LAND
 *
 * Entity type uid: 24917
 */
public class RangeRover extends EntityType
{
    public RangeRover()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)81); // uid 24911, Car
        setSubCategory((byte)114); // uid 24916, Sports Utility Vehicle (SUV), Full/Premium/Luxury (Large)
        setSpecific((byte)1); // uid 24917, Range Rover
    }
}