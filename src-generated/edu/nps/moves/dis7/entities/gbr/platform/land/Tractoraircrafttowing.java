package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@67064bdc;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 14934
 */
public class Tractoraircrafttowing extends EntityType
{
    /** Default constructor */
    public Tractoraircrafttowing()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)6); // uid 14931, Small Wheeled Utility Vehicle
        setSubCategory((byte)3); // uid 14934, Tractor, aircraft towing
    }
}
