package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@2264ea32;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 32338
 */
public class AT105SaxonIEW extends EntityType
{
    /** Default constructor */
    public AT105SaxonIEW()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)2); // uid 14887, Armored Fighting Vehicle
        setSubCategory((byte)7); // uid 14896, AT 105 Saxon
        setSpecific((byte)3); // uid 32338, AT 105 Saxon IEW
    }
}
