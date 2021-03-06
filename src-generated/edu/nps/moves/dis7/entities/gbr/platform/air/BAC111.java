package edu.nps.moves.dis7.entities.gbr.platform.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@4ba6ec50;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: AIR;
 *
 * Entity type uid: 23835
 */
public class BAC111 extends EntityType
{
    /** Default constructor */
    public BAC111()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)87); // uid 23833, Civilian Fixed Wing Aircraft, Large (up to 255,000 lbs / 115,666 kg)
        setSubCategory((byte)32); // uid 23834, Twin Jet
        setSpecific((byte)1); // uid 23835, BAC-111
    }
}
