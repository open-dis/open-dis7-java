package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28, 2020-05-07
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@9880a15
 * Country: United States of America (USA)
 * Entity kind: Expendable
 * Domain: AIR
 *
 * Entity type uid: 24985
 */
public class Hydra70wM264RPSmokeWarhead extends EntityType
{
    public Hydra70wM264RPSmokeWarhead()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)8); // uid 24983, Smoke Generator
        setSubCategory((byte)1); // uid 24984, Smoke Screen
        setSpecific((byte)1); // uid 24985, Hydra 70 w/ M264 RP Smoke Warhead
    }
}
