package edu.nps.moves.dis7.entities.gbr.munition.antipersonnel;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@69eb544f;
 * Country: United Kingdom of Great Britain and Northern Ireland (GBR);
 * Entity kind: Munition;
 * Domain: ANTI_PERSONNEL;
 *
 * Entity type uid: 24017
 */
public class L33A1Canister extends EntityType
{
    /** Default constructor */
    public L33A1Canister()
    {
        setCountry(Country.UNITED_KINGDOM_OF_GREAT_BRITAIN_AND_NORTHERN_IRELAND_GBR);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.ANTI_PERSONNEL));

        setCategory((byte)2); // uid 21010, Ballistic
        setSubCategory((byte)3); // uid 24016, 76 mm
        setSpecific((byte)1); // uid 24017, L33A1 Canister
    }
}
