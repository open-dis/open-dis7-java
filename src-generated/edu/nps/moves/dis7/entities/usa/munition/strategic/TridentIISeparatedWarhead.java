package edu.nps.moves.dis7.entities.usa.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@ae3c140;
 * Country: United States of America (USA);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 32521
 */
public class TridentIISeparatedWarhead extends EntityType
{
    /** Default constructor */
    public TridentIISeparatedWarhead()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20282, Guided
        setSubCategory((byte)11); // uid 26360, UGM-133 Trident II D5
        setSpecific((byte)3); // uid 32521, Trident II Separated Warhead
    }
}
