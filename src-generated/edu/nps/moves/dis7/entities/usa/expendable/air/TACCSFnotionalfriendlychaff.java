package edu.nps.moves.dis7.entities.usa.expendable.air;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$ExtraElem@97b5e6a;
 * Country: United States of America (USA);
 * Entity kind: Expendable;
 * Domain: AIR;
 *
 * Entity type uid: 22223
 */
public class TACCSFnotionalfriendlychaff extends EntityType
{
    /** Default constructor */
    public TACCSFnotionalfriendlychaff()
    {
        setCountry(Country.UNITED_STATES_OF_AMERICA_USA);
        setEntityKind(EntityKind.EXPENDABLE);
        setDomain(Domain.inst(PlatformDomain.AIR));

        setCategory((byte)1); // uid 22220, Chaff
        setSubCategory((byte)1); // uid 22221, Bundle
        setSpecific((byte)0); // uid 22222, Bundle, Other
        setExtra((byte)1); // uid 22223, TACCSF notional friendly chaff
    }
}
