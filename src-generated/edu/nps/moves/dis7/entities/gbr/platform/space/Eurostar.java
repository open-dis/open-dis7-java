package edu.nps.moves.dis7.entities.gbr.platform.space;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@526a9908;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: SPACE;
 *
 * Entity type uid: 15637
 */
public class Eurostar extends EntityType
{
    /** Default constructor */
    public Eurostar()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.SPACE));

        setCategory((byte)2); // uid 15629, Unmanned
        setSubCategory((byte)1); // uid 15630, Communication satellite
        setSpecific((byte)7); // uid 15637, Eurostar
    }
}
