package edu.nps.moves.dis7.entities.rus.munition.strategic;

import edu.nps.moves.dis7.pdus.*;
import edu.nps.moves.dis7.enumerations.*;

/**
 * SISO-REF-010-v28 (2020-05-07)
 * name: edu.nps.moves.dis7.source.generator.entityTypes.GenerateEntityTypes$SpecificElem@54a056e4;
 * Country: Russia (RUS);
 * Entity kind: Munition;
 * Domain: STRATEGIC;
 *
 * Entity type uid: 20935
 */
public class AS15BTu160Blackjackwnuclearwarhead extends EntityType
{
    /** Default constructor */
    public AS15BTu160Blackjackwnuclearwarhead()
    {
        setCountry(Country.RUSSIA_RUS);
        setEntityKind(EntityKind.MUNITION);
        setDomain(Domain.inst(MunitionDomain.STRATEGIC));

        setCategory((byte)1); // uid 20919, Guided
        setSubCategory((byte)11); // uid 20933, AS-15 Kent
        setSpecific((byte)2); // uid 20935, AS-15B (Tu-160 Blackjack) w/nuclear warhead
    }
}
