package edu.nps.moves.dis7.entities.usa.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SubCategoryElem@26d028f7;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 20292
 */
public class UGM73Poseidon extends EntityType
{
    /** Default constructor */
    public UGM73Poseidon()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20282, Guided
        setSubCategory((byte)9); // uid 20292, UGM-73 Poseidon
    }
}
