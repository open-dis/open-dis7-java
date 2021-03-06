package edu.nps.moves.dis7.entities.gbr.platform.land;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@48a0c8aa;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Platform;
 * Domain: LAND;
 *
 * Entity type uid: 28153
 */
public class L118LightGun105mmTowedConfiguration extends EntityType
{
    /** Default constructor */
    public L118LightGun105mmTowedConfiguration()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.PLATFORM);
        setDomain(Domain.inst(PlatformDomain.LAND));

        setCategory((byte)5); // uid 14926, Towed artillery
        setSubCategory((byte)2); // uid 14928, L-118 105-mm
        setSpecific((byte)1); // uid 28153, L118 Light Gun, 105 mm (Towed Configuration)
    }
}
